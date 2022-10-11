function MeterToFeet(num){
    num = num * 3.28084;
    var n = num.toFixed(2);
    document.getElementById("p7").innerHTML = "Meter to Feet:" + n;

}
function FeetToMeter(num){
 num = num/3.28084;
 var n = num.toFixed(2);
 document.getElementById("p8").innerHTML = "Feet to Meter:" + n;
}