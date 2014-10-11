(defproject annotator "0.1"
  :source-paths ["src-clj"]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2341"]
                 [compojure "1.1.8"]]
  :plugins [[lein-cljsbuild "1.0.3"]
            [lein-ring "0.8.11"]]
  :cljsbuild {:builds {:dev {:source-paths ["src-cljs"]
                             :compiler {:output-dir "target/dev/public/js"
                                        :output-to "target/dev/public/js/main.js"
                                        :optimizations :whitespace
                                        :pretty-print true
                                        :source-map "target/dev/public/js/main.map"}}
                       :production {:source-paths ["src-cljs"]
                                    :compiler {:output-to "target/production/public/js/main.min.js"
                                               :optimizations :advanced
                                               :pretty-print false}}}})
