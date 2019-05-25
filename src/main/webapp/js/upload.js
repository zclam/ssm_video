$(function () {
    var $list = $("#thelist .table"),
        $btn = $("#uploadBtn");

    // WebUploader上传入口类。创建Uploader实例，等同于new Uploader( opts );
    var uploader = WebUploader.create({
        resize: false, // 不压缩image
        swf: './Uploader.swf',// swf文件路径
        server: 'admin_uploader_add',// 文件接收服务端地址
        pick: '#picker', // 选择文件的按钮。可选
        chunked: false, //是否要分片处理大文件上传
        //  chunkSize:2*1024*1024, //分片上传，每片2M，默认是5M
        auto: false, //选择文件后是否自动上传
        threads: '2',  //同时运行3个线程传输
        fileNumLimit: '5', //文件总数量5

        fileSizeLimit: 2*1024* 1024 * 1024,    // 所有文件总大小限制 6G
        fileSingleSizeLimit: 1*1024* 1024 * 1024,  // 单个文件大小限制 5 G
        duplicate: false,//是否支持重复上传
        // chunkRetry : 2, //如果某个分片由于网络问题出错，允许自动重传次数
        //runtimeOrder: 'html5,flash',
        accept: {
            title: 'Videos',
            extensions: 'mp4,flv',//{String} 允许的文件后缀，不带点，多个用逗号分割。
            mimeTypes: 'video/*'//mime类型
        },
        formData: {
            cat_id: ''
        },

    });
    uploader.on('uploadBeforeSend',function(object, data,header){
    // 修改data可以控制发送哪些携带数据。
    data.cat_id = $("#cat_id").val()
});

    // 当有文件被添加进队列的时候
    uploader.on('fileQueued', function (file) {

        $list.append('<tr id="' + file.id + '" class="file-item">'
       /*     + '<td width="5%" >' + file.id + '</td>'*/
            + '<td >' + file.name + '</td>'
            + '<td width="20%">' + (file.size / 1024 / 1024).toFixed(2) + 'M' + '</td>' //toFixed()指定小数位数,是 0 ~ 20 之间的值，包括 0 和 20。
            + '<td width="20%" class="file-pro">0%</td>'
            + '<td class="file-status">等待上传</td>'
            + '<td width="20%" class="file-manage"><a class="stop-btn" href="javascript:;">暂停</a>'//javascript: 是一个伪协议javascript:是表示在触发<a>默认动作时，执行一段JavaScript代码，而 javascript:; 表示什么都不执行，这样点击<a>时就没有任何反应。
            + '<a class="remove-this" href="javascript:;">               删除</a></td>'
            + '</tr>');

        //暂停上传的文件
        $list.on('click', '.stop-btn', function () {//可以通过on() 绑定事件来处理：$("selector").on("event",function);
            uploader.stop(true);//
        })

        //在队列中删除文件。
        $list.on('click', '.remove-this', function () {
            if ($(this).parents(".file-item").attr('id') == file.id) {
                uploader.removeFile(file);//
                $(this).parents(".file-item").remove();
            }
        })
    });

    //重复添加文件
    /*   var timer1;
       uploader.onError = function(code){
           clearTimeout(timer1);
           timer1 = setTimeout(function(){
               layer.msg('该文件已存在');
           },250);
       }*/

    // 文件上传过程中创建进度条实时显示
    uploader.on('uploadProgress', function (file, percentage) {
        $("td.file-pro").text("");
        var $li = $('#' + file.id).find('.file-pro'),//find() 方法返回被选元素（ '#'+file.id）的后代元素。
            $percent = $li.find('.file-progress');

        // 避免重复创建
        if (!$percent.length) {
            $percent = $('<div class="file-progress progress active">' +
                '<div class="progress-bar" role="progressbar" style="width: 0%">' +
                '</div>' +
                '</div>' + '<span class="per">0%</span>').appendTo($li).find('.progress-bar');
        }


        $li.siblings('.file-status').text('上传中');//返回带有类名 "file-status" 的每个 <li> 元素的所有同级元素：
        $li.find('.per').text((percentage * 100).toFixed(2) + '%');

        $percent.css('width', percentage * 100 + '%');
    });

    // 文件上传成功
    uploader.on('uploadSuccess', function (file) {
        $('#' + file.id).find('.file-status').text('已上传');

    });

    // 文件上传失败，显示上传出错
    uploader.on('uploadError', function (file) {
        $('#' + file.id).find('.file-status').text('上传出错');
    });


    $btn.on('click', function () {
        if ($(this).hasClass('disabled')) {
            return false;
        }
        uploader.upload();
 /*       return "redirect:/admin_video_list?cat_id="+v.getCat_id();*/
    });
})