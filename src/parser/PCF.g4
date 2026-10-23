grammar PCF;

//symboles non terminaux : minuscule ; types de lexème : majuscule (première lettre au moins)

exp: NUMBER                             # Number
   | exp OP1 exp                        # BinaryExp1
   | exp OP2 exp                        # BinaryExp2
   | 'ifz' exp 'then' exp 'else' exp    # IfZero
   | '(' exp ')'                        # ParExp
   | VAR                                # Var
   | 'let' VAR '=' exp 'in' exp         # Let
   ;

NUMBER: '0' | [1-9][0-9]* ;
OP1: '*' | '/' ;
OP2: '+' | '-' ;
WS : [ \r\t\n]+ -> skip ;
VAR : [a-z][a-z0-9]* ;
