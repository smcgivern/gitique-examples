(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'gitique-examples.core
   :output-to "out/gitique_examples.js"
   :output-dir "out"})
