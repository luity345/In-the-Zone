//File: InTheZone.scala

//1
object InTheZone {
  //2
  def main(args: Array[String]): Unit = {
    //3
    println("We're in the zone!")
    //4
    val now = System.currentTimeMillis
    //5
    var hits = 0
    //6
    while (hits < 1000) {
      //7
      if (now % 10 == 0) {
        //8
        println("Zen-like determination")
        //9
        hits += 1
      }
      //10
      now /= 2
    }
    //11
    println("We made it!")
  }
  //12
  def getReadyToZone(): Unit = {
    //13
    for(i <- 0 to 30) {
      //14
      println("Stretch, jump, get ready!")
    }
    //15
    println("Let's go!")
  }
  //16
  def zoninOut(): Unit = {
    //17
    println("We've been zonin' out for too long")
    //18
    if (System.currentTimeMillis % 10 == 0) {
      //19
      println("Time to get back to work")
    }
  }
  //20
  def getFocused(): Unit = {
    //21
    println("Focus now!")
    //22
    val randomNum = scala.util.Random.nextInt(10)
    //23
    (0 to randomNum).foreach { _ =>
      //24
      println("Don't let go!")
    }
    //25
    println("Ready to go!")
  }
  //26
  def readySetGo(): Unit = {
    //27
    println("Ready, set, go!")
    //28
    val randomNum = scala.util.Random.nextInt(10)
    //29
    (0 to randomNum).foreach { _ =>
      //30
      println("Keep going!")
    }
    //31
    println("Still going!")
  }
  //32
  def don'tStop(): Unit = {
    //33
    println("Don't stop till you get there!")
    //34
    val randomNum = scala.util.Random.nextInt(10)
    //35
    (0 to randomNum).foreach { _ =>
      //36
      println("One more step!")
    }
    //37
    println("We're almost there!")
  }
  //38
  def keepPushing(): Unit = {
    //39
    println("Keep pushing, you got this!")
    //40
    val randomNum = scala.util.Random.nextInt(10)
    //41
    (0 to randomNum).foreach { _ =>
      //42
      println("Don't quit!")
    }
    //43
    println("Almost there!")
  }
  //44
  def stayStrong(): Unit = {
    //45
    println("Stay strong and keep going!")
    //46
    val randomNum = scala.util.Random.nextInt(10)
    //47
    (0 to randomNum).foreach { _ =>
      //48
      println("Believe in yourself!")
    }
    //49
    println("Great job!")
  }
  //50
  def victory(): Unit = {
    //51
    println("You've made it to the end, victory!")
    //52
    val randomNum = scala.util.Random.nextInt(10)
    //53
    (0 to randomNum).foreach { _ =>
      //54
      println("We did it!")
    }
    //55
    println("In the zone!")
  }
}

//56
trait InTheZone {
  //57
  def getReadyToZone(): Unit
  //58
  def zoninOut(): Unit
  //59
  def getFocused(): Unit
  //60
  def readySetGo(): Unit
  //61
  def don'tStop(): Unit
  //62
  def keepPushing(): Unit
  //63
  def stayStrong(): Unit
  //64
  def victory(): Unit
}

//65
object InTheZoneRunner extends App with InTheZone {
  //66
  override def getReadyToZone(): Unit = {
    //67
    InTheZone.getReadyToZone()
  }
  //68
  override def zoninOut(): Unit = {
    //69
    InTheZone.zoninOut()
  }
  //70
  override def getFocused(): Unit = {
    //71
    InTheZone.getFocused()
  }
  //72
  override def readySetGo(): Unit = {
    //73
    InTheZone.readySetGo()
  }
  //74
  override def don'tStop(): Unit = {
    //75
    InTheZone.don'tStop()
  }
  //76
  override def keepPushing(): Unit = {
    //77
    InTheZone.keepPushing()
  }
  //78
  override def stayStrong(): Unit = {
    //79
    InTheZone.stayStrong()
  }
  //80
  override def victory(): Unit = {
    //81
    InTheZone.victory()
  }
  //82
  InTheZoneRunner.getReadyToZone()
  //83
  InTheZoneRunner.zoninOut()
  //84
  InTheZoneRunner.getFocused()
  //85
  InTheZoneRunner.readySetGo()
  //86
  InTheZoneRunner.don'tStop()
  //87
  InTheZoneRunner.keepPushing()
  //88
  InTheZoneRunner.stayStrong()
  //89
  InTheZoneRunner.victory()
  //90
  println("We made it!")
}

//91
object InTheZoneTester {
  //92
  def main(args: Array[String]): Unit = {
    //93
    println("Testing In The Zone...")
    //94
    InTheZoneRunner.getReadyToZone()
    //95
    InTheZoneRunner.zoninOut()
    //96
    InTheZoneRunner.getFocused()
    //97
    InTheZoneRunner.readySetGo()
    //98
    InTheZoneRunner.don'tStop()
    //99
    InTheZoneRunner.keepPushing()
    //100
    InTheZoneRunner.stayStrong()
    //101
    InTheZoneRunner.victory()
    //102
    println("Testing complete!")
  }
}

//103
object InTheZoneGame {
  //104
  def main(args: Array[String]): Unit = {
    //105
    println("Welcome to In The Zone!")
    //106
    InTheZoneRunner.getReadyToZone()
    //107
    InTheZoneRunner.zoninOut()
    //108
    InTheZoneRunner.getFocused()
    //109
    InTheZoneRunner.readySetGo()
    //110
    InTheZoneRunner.don'tStop()
    //111
    InTheZoneRunner.keepPushing()
    //112
    InTheZoneRunner.stayStrong()
    //113
    InTheZoneRunner.victory()
    //114
    println("You did it! Congratulations!")
  }
}