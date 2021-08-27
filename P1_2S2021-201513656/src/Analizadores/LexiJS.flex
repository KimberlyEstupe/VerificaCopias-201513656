package Analizadores;
import static Analizadores.Tokenjs.*;
%%
%class LexiJS
%type Tokenjs
L = [a-zA-Z_]+
D = [0-9]+
N = [0-9]+("."[0-9]+)?
C = \"[^\"]*\" /*cadena*/
COMM = [\/][\*]((.)|"\n")*[\*][\/]
CHA = [\'](.)[\']

espacio=[ ,\t,\r,\n]+
%{
    public String Lexejs;
%}
%%

/*() {Lexejs=yytext(); return ;}*/
{espacio} {/*Ignore*/}

/* Comentarios */
( [\/][\/](.)* ) {Lexejs=yytext(); return COMENTARIO;}
{COMM} {Lexejs= yytext(); return COM_MULTILINEA;}

(class) {Lexejs=yytext(); return Clase;}
(do) {Lexejs=yytext(); return Do;}
(while) {Lexejs=yytext(); return While;}
(if) {Lexejs=yytext(); return If;}
(else) {Lexejs=yytext(); return Else;}
(var | let | const) {Lexejs=yytext(); return Variable;}
(String) {Lexejs=yytext(); return Tkstring;}
(llamada){D} {Lexejs=yytext(); return Llamada;}
(for) {Lexejs=yytext(); return For;}
(switch) {Lexejs=yytext(); return Switch;}
(break) {Lexejs=yytext(); return Break;}
(require) {Lexejs=yytext(); return Require;}
(true | false)      {Lexejs = yytext(); return Booleano;}
(console) {Lexejs=yytext(); return Console;}
(log) {Lexejs=yytext(); return Log;}

( "=" ) {Lexejs=yytext(); return Igual;}
( "+" ) {Lexejs=yytext(); return Suma;}
( "-" ) {Lexejs=yytext(); return Resta;}
( "*" ) {Lexejs=yytext(); return Multiplicacion;}
( "/" ) {Lexejs=yytext(); return Division;}
( "%" ) {Lexejs=yytext(); return Modulo;}

( "(" ) {Lexejs=yytext(); return ParentesisA;}
( ")" ) {Lexejs=yytext(); return ParentesisC;}
( "{" ) {Lexejs=yytext(); return LlaveA;}
( "}" ) {Lexejs=yytext(); return LlaveC;}

("&&") {Lexejs=yytext(); return And;}
("||") {Lexejs=yytext(); return Or;}
("!") {Lexejs=yytext(); return Not;}

(">") {Lexejs=yytext(); return Mayor;}
("<") {Lexejs=yytext(); return Menor;}
("==") {Lexejs=yytext(); return Igualacion;}
("!=") {Lexejs=yytext(); return Negacion;}
(">=") {Lexejs=yytext(); return Mayor_Igual;}
("<=") {Lexejs=yytext(); return Menor_Igual;}

("++") {Lexejs=yytext(); return Incremente;}
("--") {Lexejs=yytext(); return Decremento;}

(";") {Lexejs=yytext(); return Punto_y_coma;}
(".") {Lexejs=yytext(); return Punto;}
(",") {Lexejs=yytext(); return Coma;}


{C} {Lexejs=yytext(); return Cadena;}
{L}({L}|{D})* {Lexejs=yytext(); return Identificador;}
{N} {Lexejs=yytext(); return Numero;}
{CHA} {Lexejs=yytext(); return Char;}

/* Error de analisis */
 . {return ERROR;}