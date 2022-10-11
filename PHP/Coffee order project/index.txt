<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>a4-Asmabanu-Saiyed</title>
        <link rel="stylesheet" href="style.css">
        <style>
h2{
  background-image: url('logo-en.jpg');
  background-color: orange;
}
  #content{
    background-color:darkturquoise;
}
</style>
    </head>
    <body id ="bodystyle">
    <img src="_images\logo-en.jpg" alt="tim" width="300" height="300">

    <h2>Welcome To Tim Horton's!</h2>
       <div id="content">
            	
            <form action="order.php" method="post">
                <h3>Give us some numbers...</h3>	
				<div id="data">
                <label for="quantity">Number of coffes:</label>
             <input type="number" id="Number_of_Coffes" name="Number_of_Coffes" min="1" max="5" required>
<br>
        <br>
        <label>Size:</label>
                    <select name="size" id="size_Cup">
                    <option value="Size0">select</option>
                    <option value="size1">small</option>
                    <option value="size2">medium</option>
                    <option value="size3">Large</option>
                    <option value="size4">extra large</option>
                    </select>
        <span id="size_Coffes"></span>
        <br>
        <br>
                    <label for="quantity">How many creams: </label>
                   <input type="number" id="Number_creams" name="Number_creams" min="1" max="5" required>
        <br>
        <br>

                    <label for="quantity">How many sugars: </label>
                   <input type="number" id="Number_sugars" name="Number_sugars" min="1" max="5" required>
        <br>
                    
        <span id="Number_sugars"></span>
        <br>
        <br>  
					
				</div>
				
				<div id="buttons">
					<label>&nbsp;</label>
					<input type="submit" name="submit" value="Order coffee"><br>
				</div>
            </form>
        </div>
    </body>
</html>