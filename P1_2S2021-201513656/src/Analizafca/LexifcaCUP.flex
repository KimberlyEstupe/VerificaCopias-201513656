package Analizafca;
import java_cup.runtime.Symbol;
%%
%class LexifcaCUP
%type java_cup.runtime.Symbol
%cup
%full
%line
%column

L = [a-zA-Z_]+
D = [0-9]+
N = [0-9]+("."[0-9]+)?
C1 = \"[^\"]*\" /*cadena*/
C2 = [\“](.)*[\”]
ID =({L}|("_"{L}))({L}|{D}|"_")*
COMMULTI = [\#][\*]((.)|"\n")*[\*][\#] //comentario multilinea
COM = [\#][\#](.)* // Comentario uniline
R1 = [\'](.)*[\']
R2 = [\‘](.)*[\’]
espacio=[ \t\r]+

%{
    public Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    public Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}

%%
/*--------------------- IGNORA --------------------------------------------------------*/

{espacio} {/*Ignore*/}
{COMMULTI} | {COM} {/* Comentario */}

/*--------------------- PALABRAS RESERVADAS --------------------------------------------------------*/
DefinirGlobales {return new Symbol(sym.Globales, yycolumn, yyline, yytext());}
GraficaBarras   {return new Symbol(sym.GBarras, yycolumn, yyline, yytext());}
GraficaLineas   {return new Symbol(sym.GLineas, yycolumn, yyline, yytext());}
GraficaPie      {return new Symbol(sym.GPie, yycolumn, yyline, yytext());}
Compare         {return new Symbol(sym.Compare, yycolumn, yyline, yytext());}
string          {return new Symbol(sym.String, yycolumn, yyline, yytext());}
double          {return new Symbol(sym.Double , yycolumn, yyline, yytext());}
EjeX            {return new Symbol(sym.EjeX , yycolumn, yyline, yytext());}
Titulo          {return new Symbol(sym.Titulo , yycolumn, yyline, yytext());}
Valores         {return new Symbol(sym.Valores , yycolumn, yyline, yytext());}
TituloX         {return new Symbol(sym.TituloX , yycolumn, yyline, yytext());}
TituloY         {return new Symbol(sym.TituloY , yycolumn, yyline, yytext());}
Archivo         {return new Symbol(sym.Archivo , yycolumn, yyline, yytext());}

("(")        {return new Symbol(sym.ParenA, yycolumn, yyline, yytext());}
(")")        {return new Symbol(sym.ParenC, yycolumn, yyline, yytext());}
("{")        {return new Symbol(sym.LlaveA, yycolumn, yyline, yytext());}
("}")        {return new Symbol(sym.LlaveC, yycolumn, yyline, yytext());}
("[")        {return new Symbol(sym.CorcheA, yycolumn, yyline, yytext());}
("]")        {return new Symbol(sym.CorcheC, yycolumn, yyline, yytext());}

({C1} | {C2})   {return new Symbol(sym.Cadena, yycolumn, yyline, yytext());}
{N}             {return new Symbol(sym.Numero, yycolumn, yyline, yytext());}
{ID}            {return new Symbol(sym.Identificador, yycolumn, yyline, yytext());}
({R1} | {R2})   {return new Symbol(sym.Ruta, yycolumn, yyline, yytext());}
 . {}