
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/GroupCA/GroupCA/conf/routes
// @DATE:Tue Mar 06 16:51:34 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
