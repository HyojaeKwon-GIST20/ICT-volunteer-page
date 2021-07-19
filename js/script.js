//par를 받아서 scroll하는 function
function WindowScrollTo(par){
  console.log(par)
  window.scrollTo({top:par, behavior:'smooth'})
}
//section3에 대한 위치 받기
let loc_3 = document.querySelector('#sec_3').offsetTop;
let go_3 = document.querySelector('#goto_3')

//함수 실행
go_3.addEventListener("click",function(){WindowScrollTo(loc_3)})
