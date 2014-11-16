;Michał Piotr Szmigiel
;Clojure 1.6.0
;16 listopada 2014 r.
;funkcji zespolona w Clojure

(ns ComplexFunction)

;Tworzenie funkcji realisa
(defn re
  [x y]
  (- (* x x) (* y y)))

;Tworzenie funkcji imaginarisa
(defn im
  [x y]
  (* 2 (* x y)))

;Tworzenie funkcji liczby zespolonej
(defn complex
  [re im]
  (if(and (= re 0) (>= im 0))
          (str im"j")
          (if(and (= re 0) (< im 0))
                    (str im"j")
                    (if(and (< re 0) (< im 0))
                              (str "("re""im"j)")
                            (if(and (> re 0) (< im 0))
                                    (str "("re""im"j)")
                                    (str "("re"+"im"j)"))))))
;Tworzenie funkcji zespolonej
(defn complex_function
  [x y]
  (complex (re x y) (im x y)))
