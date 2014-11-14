(ns complex)
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

(defn planar_complex
  [a1 a2 b1 b2]
  (complex (+ a1 b1) (+ a2 b2)))

(defn add_complex
  [a1 a2 b1 b2]
  (complex (+ a1 a2) (+ b1 b2)))

(defn sub_complex
  [a1 a2 b1 b2]
  (complex (- a1 a2) (- b1 b2)))

(defn mult_complex
  [a1 a2 b1 b2]
  (complex (- (* a1 a2) (* b1 b2) ) (+ (* a1 b2) (* a2 b1) )))

(defn div_complex
  [a1 a2 b1 b2]
  (complex (/ ((* a1 a2) (* b1 b2)) ((* a2 a2) (* b2 b2))  )  (/ ((* a1 b2) (* a2 b1)) ((* a2 a2) (* b2 b2))  ) ))

(defn modulus
  [x y]
  (Math/sqrt (* (re x y) (im x y))))
                                  
                                

               
