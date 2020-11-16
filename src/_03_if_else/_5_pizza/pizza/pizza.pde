
PImage pineapple;
PImage pepperoni;

void setup() {
  
pineapple = loadImage("PINAAPPLE.jpg");
pineapple.resize(50, 50);
pineapple = loadImage("PINAAPPLE.jpg");
pineapple.resize(50, 50);
pineapple = loadImage("PINAAPPLE.jpg");
pineapple.resize(50, 50);

    size(500, 500);
    
fill(#F7D06B);
ellipse(150, 150, 200, 200);

fill(#E51C1F);
ellipse(150, 150, 180, 180);

fill(#FCF5A6);
ellipse(150, 150, 170, 170);
}
void draw() {


if (mousePressed){  
image(pineapple, 120, 100);
image(pineapple, 100, 160);
image(pineapple, 140, 160);
}

}
