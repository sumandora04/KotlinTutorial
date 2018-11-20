
//Sub class which will inherit the Enemy class
/*
class Troll(name:String, hitPoint:Int, lives:Int) : Enemy(name,hitPoint,lives) { // have to provide all the details for Enemy class through Troll class.

}*/

class Troll(name:String) : Enemy(name,27,1) { // have to provide only Name for Enemy class through Troll class and others will be default value.

}
