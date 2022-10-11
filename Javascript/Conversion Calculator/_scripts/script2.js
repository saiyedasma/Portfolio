function cmToMeter(num){
    num = num * 0.01;
    var n = num.toFixed(2);
    document.getElementById("p3").innerHTML = "cm to Meter:" + n;

}
function MeterTocm(num){
 num = num/0.01;
 var n = num.toFixed(2);
 document.getElementById("p4").innerHTML = "Meter to cm:" + n;
}