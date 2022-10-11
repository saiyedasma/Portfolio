let btnclear = document.querySelector('button');
let inputs = document.querySelectorAll('input');

btnclear.addEventListener('click',()=>{
    inputs.forEach(input => input.value ='');
    console.log(input)
});