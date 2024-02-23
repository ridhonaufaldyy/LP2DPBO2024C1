#ifndef CLOTHING_H
#define CLOTHING_H

#include "Product.h"
#include <string>

class Clothing : public Product {
public:
    std::string size;
    std::string material;
    std::string gender;
};

#endif // CLOTHING_H
