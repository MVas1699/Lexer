package p1_lfa;
import static p1_lfa.Tokens.*;
%%
%line
%class Lexer
%type Tokens

D=[0-9]+
P = [.]
E = {D}*
F = {D} {P} {D}+
espacio=[ ,\t,\r,\n]+
L = [A-Za-z]*
%{
    public String lexeme;
    public int GetLine() {return yyline+1;}

%}
%%
int |
if |
else |
while {lexeme=yytext(); return Reservadas;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"+" {return Positivo;}
"-" {return Negativo;}

("(-"{D}+")")|{D}+ {lexeme=yytext(); return Entero;}
{F} {lexeme=yytext(); return Decimal;}
{E}{L}{E}* {lexeme=yytext(); return CadenaNoValida;}
{L}+ {E} | {L}+ {E} {L} {lexeme=yytext(); return NoValido;}
{F} {P} | {F} {P} {D} | {D} {P} {P} | {D} {P} {P} {P} | {P} {D} | {D}{P}{D}{P}{D}  {lexeme=yytext(); return ErrorMatematico;}
 . {return ERROR;}

