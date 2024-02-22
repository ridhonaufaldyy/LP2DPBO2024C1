<?php
require_once 'Product.php';

class Clothing extends Product {
    protected $size;
    protected $material;
    protected $gender;

    public function __construct($idProduct, $name, $brand, $price, $size, $material, $gender) {
        parent::__construct($idProduct, $name, $brand, $price);
        $this->size = $size;
        $this->material = $material;
        $this->gender = $gender;
    }
}
?>
