
$(function() {
	// 大ジャンルコード変更時のイベント
	$("#genreLgCd").change(function(){
		// 中ジャンルの要素を取得してプルダウンにセット
	    $.ajax({
	        url: "/k-shop/maintenance/common/genremd",
	        type: "GET",
	        // data部分がformにセットされる。
	        data: {
	        	genreLgCd: $('#genreLgCd').val(),
	        	fragment:"maintenance/goods_newedit::genreMdSelect"
	        },
	        dataType: "html",
	        success: function(data){
	            $("#genreMdCd").html(data);
	        }
	    });

	    $("#genreSmCd").children().remove();
	});

	// 中ジャンルコード変更時のイベント
	$("#genreMdCd").change(function(){
		// 小ジャンルの要素を取得してプルダウンにセット
	    $.ajax({
	        url: "/k-shop/maintenance/common/genresm",
	        type: "GET",
	        // data部分がformにセットされる。
	        data: {
	        	genreMdCd: $('#genreMdCd').val(),
	        	fragment: "maintenance/goods_newedit::genreSmSelect"
	        },
	        dataType: "html",
	        success: function(data){
	            $("#genreSmCd").html(data);
	        }
	    });
	});

	// 小ジャンルコード変更時のイベント
	$("#genreSmCd").change(function(){
		$("#goodsCd").val($("#genreSmCd").val());
	});

});
