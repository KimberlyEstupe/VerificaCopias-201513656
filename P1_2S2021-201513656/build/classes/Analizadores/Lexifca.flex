package Analizadores;
import static Analizadores.Tokensfca.*;
%%
%class Lexifca
%type Tokensfca
%line
%column
%init{
    yyline = 1;
    yycolumn = 1;
%init}

L = [a-zA-Z_]+
D = [0-9]+
N = [0-9]+("."[0-9]+)?
C1 = \"[^\"]*\" /*cadena*/
C2 = [\“](.)*[\”]
ID =({L}|("_"{L}))({L}|{D}|"_")*
espacio=[ \t\r\n]+
COMMULTI = [\#][\*]((.)|"\n")*[\*][\#] //comentario multilinea
COM = [\#][\#](.)* // Comentario uniline
R1 = [\'](.)*[\']
R2 = [\‘](.)*[\’]

%{
    public String Lexefca;
    public int Lineafca;
    public int Colufca;
%}
%%

/*() {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return ;}*/
{espacio} {/*Ignore*/}

/* Comentarios */
{COMMULTI}  {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Comentario_Multilinea;}
{COM}       {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Comentario;}


DefinirGlobales {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Definir_Globales;}
GraficaBarras   {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Grafica_Barras;}
GraficaLineas   {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Grafica_Lineas;}
GraficaPie      {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Grafica_Pie;}
Compare         {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Compare;}
string          {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Dato_String;}
double          {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Dato_Double;}
EjeX            {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Eje_X;}
Titulo          {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Titulo;}
Valores         {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Valores;}
TituloX         {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Titulo_X;}
TituloY         {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Titulo_Y;}
Archivo         {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Archivo;}

(";")   {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Punto_y_coma;}
(".")   {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Punto;}
("\,")  {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Coma;}
(":")   {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Dos_Puntos;}
("=")   {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Igual;}
"$"     {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Signo_Dolar;}


"{" {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Llave_Apertura;}
"}" {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Llave_Cierre;}
"[" {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Corchete_Apertura;}
"]" {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Corchete_Cierre;}
"(" {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Parentesis_Apertura;}
")" {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Parentesis_Cierre;}

 
({C1} | {C2})   {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Cadena;}
{ID}        {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Identificador;}
{N}         {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Numero;}
({R1} | {R2})   {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return Ruta;}

. {Lexefca=yytext();Lineafca =yyline;Colufca=yycolumn;  return ERROR;}
