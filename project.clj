(defproject terminal-todo-mvc "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.0-beta1"]
                 [com.phronemophobic/membrane "0.9.31.8-beta"]
                 [com.googlecode.lanterna/lanterna "3.1.1"]]
  :jvm-opts ["-Dclojure.compiler.direct-linking=true"]
  :main ^:skip-aot terminal-todo-mvc.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
