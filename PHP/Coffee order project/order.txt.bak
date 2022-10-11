<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
         <title>Tim hortons</title>
        <link rel="stylesheet" href="_css/styles.css">
        <style>
          h2{
            background-color:darkturquoise;
          }
        </style>
    </head>
    <body>
		
        <?php
	   
        $Number_of_Coffes= $_REQUEST['Number_of_Coffes'];
        
        $size_of_Cup= $_REQUEST['size']; 

        $How_many_creams= $_REQUEST['Number_creams']; 
      
        $How_many_sugars= $_REQUEST['Number_sugars']; 
        
        $Price_of_Coffes= 0;


        switch($size_of_Cup){
          case "size1": 
            for ($i=1; $i<= $Number_of_Coffes; $i++) 
              echo '<img src="_images/cup.jpg" width="50" height="50"\>';
              $Price_of_Coffes = 1;  
            break;
          case "size2":
            for ($i=1; $i<= $Number_of_Coffes; $i++) 
            echo '<img src="_images/cup.jpg" width="100" height="100"\>';
            $Price_of_Coffes = 1.5;  
            break;
          case "size3":
            for ($i=1; $i<= $Number_of_Coffes; $i++) 
            echo '<img src="_images/cup.jpg" width="150" height="150"\>'; 
            $Price_of_Coffes = 2;  
            break;
          case "size4":
            for ($i=1; $i<= $Number_of_Coffes; $i++) 
            echo '<img src="_images/cup.jpg" width="200" height="200"\>';  
            $Price_of_Coffes = 2.5; 
            break;
  
      default;
      }
      
        echo "<img src='_images\plus.jpg'\>"; 
        for ($i=1; $i<=$How_many_creams; $i++) 
        {
           
          echo "<img src='_images\cream.jpg'\>"; 

        }

        echo "<img src='_images\plus.jpg'\>"; 
        
        for ($i=1; $i<=$How_many_sugars; $i++) 
        {
           
          echo "<img src='_images\sugar.jpg'\>"; 

        }
        
        $cost = $Price_of_Coffes*$Number_of_Coffes;
        $tax = $cost*1.13;

        echo "</br> Cost $".$Price_of_Coffes." x ".$Number_of_Coffes." = $".$cost." + Tax = $".$tax;

        ?>
             
               <h2>Thanks for the order. Here it is:</h2>
               <br>
               <a href="index.php">New Order</a>
               
              
    </body>
</html>