#ifndef SHIRT_H
#define SHIRT_H

#include "Clothing.h"
#include <string>

class Shirt : public Clothing {
public:
    std::string color;
    std::string sleeveType;
};

#endif // SHIRT_H
