<?php
require_once 'Clothing.php';

class Shirt extends Clothing {
    protected $color;
    protected $sleeveType;

    public function __construct($idProduct, $name, $brand, $price, $size, $material, $gender, $color, $sleeveType) {
        parent::__construct($idProduct, $name, $brand, $price, $size, $material, $gender);
        $this->color = $color;
        $this->sleeveType = $sleeveType;
    }
    

    // method get
    public function getidProduct() {
        return $this->idProduct;
    }

    public function getName() {
        return $this->name;
    }

    public function getBrand() {
        return $this->brand;
    }

    public function getPrice() {
        return $this->price;
    }

    public function getSize() {
        return $this->size;
    }

    public function getMaterial() {
        return $this->material;
    }

    public function getGender() {
        return $this->gender;
    }

    public function getColor() {
        return $this->color;
    }

    public function getSleeveType() {
        return $this->sleeveType;
    }

}
?>