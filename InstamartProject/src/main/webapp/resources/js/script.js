
document.addEventListener('DOMContentLoaded', function(){
    //Get Claim Details JS
    document.querySelectorAll('#claim-detail').forEach(function(el){
        el.addEventListener('click', function(){showHideMentod(this)});
    })
    //Dropdown Js 
    document.querySelectorAll('.ibox_pj-dropdown').forEach(function(el){
        el.addEventListener('click', function(){dropdownMethod(this)});
    }) 
    
}, false);

function showHideMentod(el){
    var getID = el.getAttribute('data-value');
    if(document.querySelector(getID).style.display == 'none'){
        document.querySelector(getID).style.display = 'table-row';
    } else {
        document.querySelector(getID).style.display = 'none';
    }
}
function dropdownMethod(el){
    var getListEl = el.querySelector('.ibox_pj-dropdown-menu');
    if(getListEl.classList.contains('view')){
        getListEl.classList.remove('view');
    } else {
        getListEl.classList.add('view');
    }
}
