
$(function() {
	$("#genreLgCd").change(function(){
	    $.ajax({
	        url: "/k-shop/maintenance/common/genremd",
	        type: "GET",
	        // data部分がformにセットされる。
	        data: {
	        	genreLgCd: genreLgCd.value,
	        	fragment:"master/goods_newedit::genreMdSelect"
	        },
	        dataType: "html",
	        success: function(data){
	            $("#genreMdCd").html(data);
	        }
	    });
	});

	$("#genreMdCd").change(function(){
	    $.ajax({
	        url: "/k-shop/maintenance/common/genresm",
	        type: "GET",
	        // data部分がformにセットされる。
	        data: {
	        	genreMdCd: genreMdCd.value,
	        	fragment: "master/goods_newedit::genreSmSelect"
	        },
	        dataType: "html",
	        success: function(data){
	            $("#genreSmCd").html(data);
	        }
	    });
	});
});
