CKEDITOR.editorConfig = function(config) { 
	
	 /*
	  * var contextPath = $('.contextPath').html();
	  * config.filebrowserBrowseUrl = contextPath+'/ckeditor/browseimage';
	 config.filebrowserImageUploadUrl = contextPath+'/ckeditor/uploadimage';
	 alert("config.allowedContent: " + config.allowedContent);*/
	
	config.extraPlugins = 'image2,widget,widgetselection,clipboard,lineutils,embed,embedbase,notificationaggregator,notification';
};