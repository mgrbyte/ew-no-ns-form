(defproject ew-no-ns-form "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles
  {:dev
   {:plugins
    [[jonase/eastwood "0.2.3"
      :exclusions [org.clojure/clojure]]]}})

