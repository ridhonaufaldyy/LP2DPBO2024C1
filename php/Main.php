<?php
require_once 'Shirt.php';

//input data hardcode
$shirt1 = new Shirt(1, 'T-Shirt', 'Nike', '20 rebu', 'M', 'Cotton', 'Male', 'Red', 'Short');
$shirt2 = new Shirt(2, 'Polo Shirt', 'Adidas', '25 rebu', 'L', 'Polyester', 'Male', 'Blue', 'Long');

// Menyimpan objek-objek Shirt dalam array $shirts
$shirts = [$shirt1, $shirt2];
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Table</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid #dddddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h2>Product Table</h2>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Brand</th>
                <th>Price</th>
                <th>Size</th>
                <th>Material</th>
                <th>Gender</th>
                <th>Color</th>
                <th>Sleeve Type</th>
            </tr>
        </thead>
        <tbody>
            <!-- looping sebanyak data-->
        <?php foreach ($shirts as $shirt): ?>
        <tr>
            <td><?php echo $shirt->getIdProduct(); ?></td>
            <td><?php echo $shirt->getName(); ?></td>
            <td><?php echo $shirt->getBrand(); ?></td>
            <td><?php echo $shirt->getPrice(); ?></td>
            <td><?php echo $shirt->getSize(); ?></td>
            <td><?php echo $shirt->getMaterial(); ?></td>
            <td><?php echo $shirt->getGender(); ?></td>
            <td><?php echo $shirt->getColor(); ?></td>
            <td><?php echo $shirt->getSleeveType(); ?></td>
        </tr>
    <?php endforeach; ?>
        </tbody>
    </table>
</body>
</html>
