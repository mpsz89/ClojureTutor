(ns ApproxError)
(defn abs [a]
  (if (< a 0)
    (- a)
    a))

(defn abserr [x o]
  (abs (- x o)))

(defn relerr [x o]
  (if (not= x 0)
    (abs (/ (abs (- x o)) o))
    0))

(defn pererr [x o]
  (if (not= x 0)
    (abs (* (/ (abs (- x o)) o) 100))
    0))
