function cmToInches(num){
    num = num * 0.393701;
    var n = num.toFixed(2);
    document.getElementById("p1").innerHTML = "cm to Inches:" + n;

}
function InchesTocm(num){
 num = num/0.39370;
 var n = num.toFixed(2);
 document.getElementById("p2").innerHTML = "Inches to cm:" + n;
 }

 