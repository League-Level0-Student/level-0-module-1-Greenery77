
void setup() {

    size(400, 500);
  
  
}
void draw() {
  
  PImage face = loadImage("zombie.png");
  
  face.resize(width, height);
  image(face, 0, 0);
  
  fill(30, mouseX, mouseY);
  ellipse(114, 170, 70, 70);
  ellipse(278, 155, 70, 70);
  
  fill(0, 0, 0);
  ellipse(140, 170, 10, 20);
  ellipse(300, 155, 10, 20);
  
}
