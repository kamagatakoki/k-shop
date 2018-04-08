
$(function() {

	// サブ画像クリック時のイベント
	$("[id^=subDisplay]").on("mouseover", function(){
		// クリックした画像をメインに表示する
		$("#mainDisplay").attr("src", $(this).attr('src'));
	});
});
