<?php
class Product {
    protected $idProduct;
    protected $name;
    protected $brand;
    protected $price;

    public function __construct($idProduct, $name, $brand, $price) {
        $this->idProduct = $idProduct;
        $this->name = $name;
        $this->brand = $brand;
        $this->price = $price;
    }
}
?>
