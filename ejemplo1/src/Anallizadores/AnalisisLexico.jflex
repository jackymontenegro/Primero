//--------------------Codigo Usuario
//--------------------Paquetes

package Analizadores;
import java_cup.runtime.Symbol;



%%

%{
    //Código de usuario
    String cadena= "";
    String comentarioSimple="";
    String comentarioMultiple="";
    String IDDD="";
%}

%cup
%class scanner
%public
%line
%char
%column
%full
%state CADENA
%state CSIMPLE
%state CMULTIPLE

//SIMBOLOS

PUNTO  = "."
PUNTOYC= ";"
DOSP   = ":"

PAR_A   = "\("
PAR_C   = "\)"
LLA_A   = "\{"
LLA_C   = "\}"
COR_A   = "\["
COR_C   = "\]"

COMA    = ","   

MAS     = "+"
MENOS   = "-"
POR     = "*"
DIV     = "/"
MOD     = "%"

AND     = "&"
OR      = "\u007C"
MENOR_Q = "<"
MAYOR_Q = ">"
IGUAL   = "="
NOT     = "\!"


//PALABRAS RESERVADAS
STATIC1      = "static"
FINAL1       = "final"
PUB         = "public"
PRIV        = "private"
PROT        = "protected"
VOID1       = "void"

IMPORTS     = "import"
CLASS1      = "class"

INT1     = "int"
BOOL        = "boolean"
STR         = "String"
CHAR1       = "char"
DOUB        = "double"
OBJ         = "Object"

NW          = "new"

IF1         = "if"
ELS         = "else"
FOR1        = "for"
WHILE1      = "while"
DO1         = "do"
SWITCH1     = "switch"
CASE1       = "case"
BREAK1      = "break"
RETURN1     = "return"
DEFAULT1    = "default"

SYS         = "System"
OUT1        = "out"
PRINT       = "println"
MAIN1       = "main"

TRUE1       = "true"
FALSE1      = "false"
NUL         = "null"
THIS1       = "this"
PACK        = "package"


//EXPRESIONES

ENTERO    = [0-9]+  
DECIMAL   = [0-9]+\.[0-9]+
CARACTER  = \'[A-Za-zñÑ]{1}\'
ID        =[\_]*[[A-Za-zñÑ]|$][[A-Za-zñÑ]|[0-9]|_|$]*
SPACE     = [\ \r\t\f\t]
ENTER    = [\ \n]

%%

<YYINITIAL> {STATIC1}      { return new Symbol(sym.STATIC1, yyline, yycolumn,yytext());}
<YYINITIAL> {FINAL1}      { return new Symbol(sym.FINAL1, yyline, yycolumn,yytext());}
<YYINITIAL> {PUB}     { return new Symbol(sym.PUB, yyline, yycolumn,yytext());}
<YYINITIAL> {PRIV}      { return new Symbol(sym.PRIV, yyline, yycolumn,yytext());}
<YYINITIAL> {PROT}     { return new Symbol(sym.PROT, yyline, yycolumn,yytext());}
<YYINITIAL> {VOID1}       { return new Symbol(sym.VOID1, yyline, yycolumn,yytext());}

<YYINITIAL> {IMPORTS}       { return new Symbol(sym.IMPORTS, yyline, yycolumn,yytext());}
<YYINITIAL> {CLASS1}       { return new Symbol(sym.CLASS1, yyline, yycolumn,yytext());}

<YYINITIAL> {INT1}       { return new Symbol(sym.INT1, yyline, yycolumn,yytext());}
<YYINITIAL> {BOOL}       { return new Symbol(sym.BOOL, yyline, yycolumn,yytext());}
<YYINITIAL> {STR}     { return new Symbol(sym.STR, yyline, yycolumn,yytext());}
<YYINITIAL> {CHAR1}      { return new Symbol(sym.CHAR1, yyline, yycolumn,yytext());}
<YYINITIAL> {DOUB}     { return new Symbol(sym.DOUB, yyline, yycolumn,yytext());}
<YYINITIAL> {OBJ}     { return new Symbol(sym.OBJ, yyline, yycolumn,yytext());}

<YYINITIAL> {NW}       { return new Symbol(sym.NW, yyline, yycolumn,yytext());}

<YYINITIAL> {IF1}       { return new Symbol(sym.IF1, yyline, yycolumn,yytext());}
<YYINITIAL> {ELS}       { return new Symbol(sym.ELS, yyline, yycolumn,yytext());}
<YYINITIAL> {FOR1}     { return new Symbol(sym.FOR1, yyline, yycolumn,yytext());}
<YYINITIAL> {WHILE1}      { return new Symbol(sym.WHILE1, yyline, yycolumn,yytext());}
<YYINITIAL> {DO1}     { return new Symbol(sym.DO1, yyline, yycolumn,yytext());}
<YYINITIAL> {SWITCH1}       { return new Symbol(sym.SWITCH1, yyline, yycolumn,yytext());}
<YYINITIAL> {CASE1}       { return new Symbol(sym.CASE1, yyline, yycolumn,yytext());}
<YYINITIAL> {BREAK1}       { return new Symbol(sym.BREAK1, yyline, yycolumn,yytext());}
<YYINITIAL> {RETURN1}       { return new Symbol(sym.RETURN1, yyline, yycolumn,yytext());}
<YYINITIAL> {DEFAULT1}     { return new Symbol(sym.DEFAULT1, yyline, yycolumn,yytext());}


<YYINITIAL> {SYS}      { return new Symbol(sym.SYS, yyline, yycolumn,yytext());}
<YYINITIAL> {OUT1}     { return new Symbol(sym.OUT1, yyline, yycolumn,yytext());}
<YYINITIAL> {PRINT}      { return new Symbol(sym.PRINT, yyline, yycolumn,yytext());}
<YYINITIAL> {MAIN1}     { return new Symbol(sym.MAIN1, yyline, yycolumn,yytext());}

<YYINITIAL> {TRUE1}       { return new Symbol(sym.TRUE1, yyline, yycolumn,yytext());}
<YYINITIAL> {FALSE1}       { return new Symbol(sym.FALSE1, yyline, yycolumn,yytext());}
<YYINITIAL> {NUL}       { return new Symbol(sym.NUL, yyline, yycolumn,yytext());}
<YYINITIAL> {THIS1}     { return new Symbol(sym.THIS1, yyline, yycolumn,yytext());}
<YYINITIAL> {PACK}     { return new Symbol(sym.PACK, yyline, yycolumn,yytext());}

<YYINITIAL> {PUNTO}      { return new Symbol(sym.PUNTO, yyline, yycolumn,yytext());}
<YYINITIAL> {PUNTOYC}     { String paren=yytext();System.out.println(paren);return new Symbol(sym.PUNTOYC, yyline, yycolumn,yytext());}
<YYINITIAL> {DOSP}       { return new Symbol(sym.DOSP, yyline, yycolumn,yytext());}

<YYINITIAL> {PAR_A}       {String paren=yytext();System.out.println(paren); return new Symbol(sym.PAR_A, yyline, yycolumn,yytext());}
<YYINITIAL> {PAR_C}       { return new Symbol(sym.PAR_C, yyline, yycolumn,yytext());}
<YYINITIAL> {LLA_A}     { return new Symbol(sym.LLA_A, yyline, yycolumn,yytext());}
<YYINITIAL> {LLA_C}     {return new Symbol(sym.LLA_C, yyline, yycolumn,yytext());}
<YYINITIAL> {COR_A}     {return new Symbol(sym.COR_A, yyline, yycolumn,yytext());}
<YYINITIAL> {COR_C}    {return new Symbol(sym.COR_C, yyline, yycolumn,yytext());}
<YYINITIAL> {COMA}     {return new Symbol(sym.COMA, yyline, yycolumn,yytext());}


<YYINITIAL> {MAS}      {return new Symbol(sym.MAS, yyline, yycolumn,yytext());}
<YYINITIAL> {MENOS}    {return new Symbol(sym.MENOS, yyline, yycolumn,yytext());}
<YYINITIAL> {POR}    {return new Symbol(sym.POR, yyline, yycolumn,yytext());}
<YYINITIAL> {DIV}    {return new Symbol(sym.DIV, yyline, yycolumn,yytext());}
<YYINITIAL> {MOD}    {return new Symbol(sym.MOD, yyline, yycolumn,yytext());}

<YYINITIAL> {AND}    {return new Symbol(sym.AND, yyline, yycolumn,yytext());}
<YYINITIAL> {OR}    {return new Symbol(sym.OR, yyline, yycolumn,yytext());}
<YYINITIAL> {MENOR_Q}    {return new Symbol(sym.MENOR_Q, yyline, yycolumn,yytext());}
<YYINITIAL> {MAYOR_Q}    {return new Symbol(sym.MAYOR_Q, yyline, yycolumn,yytext());}
<YYINITIAL> {IGUAL}    {return new Symbol(sym.IGUAL, yyline, yycolumn,yytext());}
<YYINITIAL> {NOT}    {return new Symbol(sym.NOT, yyline, yycolumn,yytext());}



<YYINITIAL> {ENTERO}    {String paren=yytext();System.out.println(paren); return new Symbol(sym.ENTERO, yyline, yycolumn,yytext());}
<YYINITIAL> {DECIMAL}   { return new Symbol(sym.DECIMAL, yyline, yycolumn,yytext());}
<YYINITIAL> {CARACTER}   { return new Symbol(sym.CARACTER, yyline, yycolumn,yytext());}
<YYINITIAL> {ID}        {String id1=yytext(); System.out.println(id1); return new Symbol(sym.ID, yyline, yycolumn,yytext());
                            }
<YYINITIAL> [\"]        { yybegin(CADENA); cadena+="\""; }
<YYINITIAL> "//"       { yybegin(CSIMPLE); comentarioSimple+="//"; }
<YYINITIAL> "/**"      { yybegin(CMULTIPLE); comentarioMultiple+="/**"; }
<YYINITIAL> {SPACE}     { /*Espacios en blanco, ignorados*/ }
<YYINITIAL> {ENTER}     { /*Saltos de linea, ignorados*/}


<YYINITIAL> . {
        String errLex = "Error léxico : '"+yytext()+"' en la línea: "+(yyline+1)+" y columna: "+(yycolumn+1);
        System.out.println(errLex);
}

<CADENA> {
        [\"] { String tmp=cadena+"\""; cadena=""; yybegin(YYINITIAL);  return new Symbol(sym.CADENA, yychar,yyline,tmp); }
        [\n] {String tmp=cadena; cadena="";  
                System.out.println("Se esperaba cierre de cadena (\")."); 
                yybegin(YYINITIAL);
            }
        [^\"] { cadena+=yytext();}

}
<CSIMPLE> {
        [//] { String tmp1=comentarioSimple+"//";System.out.println(tmp1); comentarioSimple=""; yybegin(YYINITIAL); }
        [\n] {String tmp=comentarioSimple; comentarioSimple=""; System.out.println(tmp);  
                yybegin(YYINITIAL);
            }
        [^\n] { comentarioSimple+=yytext();}
}

<CMULTIPLE> {
        [/**] { String tmp2=comentarioMultiple+"**/"; System.out.println(tmp2); comentarioMultiple=""; yybegin(YYINITIAL);{/*ignorar*/}}
       
         "\*/" {String tmp2=comentarioMultiple; 
                System.out.println(comentarioMultiple); 
                yybegin(YYINITIAL);
            }

        [^*/] { comentarioMultiple+=yytext();}
}
   