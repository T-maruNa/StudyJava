/*function showFukidasi(obj, elements) {
    //現在入力されている値を取得する。
    var inputText = obj.elements[elements].value;
    //取得した値をfukidasiに格納
    var target = document.getElementById(elements);
    target.textContent = inputText;
    
    //fukidasiを表示する
    var targetFukidasi = '.' + elements + ' ' + '.fukidasipop';
    $(targetFukidasi).css({
        'position': 'relative',
        'top': '0px', 
        'left': '0px',
        'display': 'block'
    });
}*/


function showFukidasi(obj, fukidasi, elements) {
    for(var i = 0 ;i < elements.length; i++){
        //現在入力されている値を取得する。
        var inputText = $(':input[name='+elements[i]+']').val();
        //取得した値をfukidasiに格納
        var target = document.getElementById(elements[i]);
        target.textContent = inputText; 
    }
    //fukidasiを表示する
    var targetFukidasi = '.' + fukidasi + ' ' + '.fukidasipop';
    $(targetFukidasi).css({
        'position': 'relative',
        'top': '0px', 
        'left': '0px',
        'display': 'block'
    });
}

