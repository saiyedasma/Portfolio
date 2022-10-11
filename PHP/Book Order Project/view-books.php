<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>View Products - Database Connectivity Example</title>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <style>
            #wrapper
            {
                width:50%;
                margin:auto;
            }

            table
            {
                border-collapse: collapse;
                width: 50%;
                margin: auto;
            }

            th, td
            {
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even){background-color: #f2f2f2}

            th
            {
                background-color: #4CAF50;
                color: white;
            }

            h2
            {
                text-align: center;
            }
        </style>
    </head>
    <body>
        <div id="wrapper">

            <h1>Database Connectivity Example</h1>

            <a href="index.php">Home</a> | 
            <a href="add-product.php">Add Product</a> | 
            <a href="view-products.php">View Products</a>

            <hr>

            <h2>View Products</h2>

                <?php
                    <h1>Database Connectivity</h1>
                    <a href="index.php">Home</a> |
                    <a href="add-book.php">Add Book</a>
                    <a href="view-books.php">View Books</a>
                ?>
        </div>
    </body>
</html>
