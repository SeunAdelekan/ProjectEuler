;; Created by Iyanu Adelekan
(ns euler.core
  (:gen-class))

(defn sum-multiples
  "Finds the sum of multiples of two numeric vars
   x and y that are less than var ceil."
  [x y ceil]
  (def multiple-sum 0)
  (def current-val 0)
  (while (< current-val ceil)
    (do
      (if
        (or
          (zero?
              (rem current-val x))
          (zero?
              (rem current-val y)))
        (def multiple-sum
          (+ multiple-sum current-val)))
      (def current-val
                      (inc current-val))))
  (println multiple-sum))

(defn -main
  [& args]
  (sum-multiples 3 5 1000))
