# Cake_Pricing_System

This Java program models a `Cake` class that manages cake pricing based on add-ons like extra cherries, extra chocolates, and takeaway options. The class uses object-oriented principles to encapsulate the attributes and behaviors associated with a cake.

Features:

- Base price determination based on vegetarian or non-vegetarian cake.
- Add-ons:
  - Extra cherries
  - Extra chocolates
- Option for takeaway with additional packing cost.
- Bill generation showing the breakdown of costs.

Code Overview

Class: `Cake`

Attributes:
- `int price`: Total price of the cake.
- `boolean veg`: Indicates if the cake is vegetarian.
- `int baseCakePrice`: Base price of the cake before add-ons.
- `boolean isExtraCherriesAdded`: Tracks if extra cherries are added.
- `boolean isExtraChocolatesAdded`: Tracks if extra chocolates are added.
- `boolean isOptedTakeAway`: Tracks if takeaway is opted.

Constants:
- `int extraCherriesCost`: Cost for adding extra cherries.
- `int extraChocolatesCost`: Cost for adding extra chocolates.
- `int packingCost`: Cost for takeaway packing.

Constructor:
- `Cake(boolean veg)`: Initializes the cake with the base price based on whether it is vegetarian or not.

Methods:
- `void addExtraCherries()`: Adds the cost of extra cherries to the total price.
- `void addExtraChocolates()`: Adds the cost of extra chocolates to the total price.
- `void takeAway()`: Adds the packing cost for takeaway to the total price.
- `void printBill()`: Prints the detailed bill showing base price, add-ons, and total price.
