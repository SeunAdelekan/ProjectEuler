;; Created by Iyanu Adelekan
(ns euler.core
  (:gen-class))

(defn gen-fib-val
  "This generates fibbonaci values."
  [x y]
  (+ x y))

(defn even-fib-sum
  "This sums up even fibonnaci values that
   are less than the limit given."
  [limit]
  (def prev-val 1)
  (def curr-val 2)
  (def even-sum curr-val)
  (while (< (gen-fib-val prev-val curr-val) limit)
    (do
      (def test-val (gen-fib-val prev-val curr-val))
      (if
        (== 0
            (rem test-val 2))
        (def even-sum
          (+ even-sum test-val)))
      (def prev-val curr-val)
      (def curr-val test-val)))
  even-sum)

(defn -main
  [& args]
  (println (even-fib-sum 4000000)))
