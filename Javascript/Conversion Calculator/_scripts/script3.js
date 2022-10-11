function InchesToMeter(num){
    num = num * 0.0254;
    var n = num.toFixed(2);
    document.getElementById("p5").innerHTML = "Inches to Meter:" + n;

}
function MeterToInches(num){
 num = num /0.0254;
 var n = num.toFixed(2);
 document.getElementById("p6").innerHTML = "Meter to Inches:" + n;
}