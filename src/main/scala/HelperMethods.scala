import java.util.regex.Pattern
import java.io.{ FileNotFoundException, FileOutputStream }

import util.Properties

object HelperMethods  {

  // Helper methods 
  def defineOs = System.getProperty("os.name").toLowerCase.take(3).toString match {
    case "lin" => ("linux", "so")
    case "mac" | "dar" => ("macosx", "lib")
    case "win" => ("windows", "dll")
    case "sun" => ("solaris", "so")
    case _ => ("unknown", "")
  }

}
