grammar Hello;

//r  : 'hello' ID ;         // match keyword hello followed by an identifier
//ID : [1-9]+ ;             // match lower-case identifiers
//WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

//fewstatements   : (statement WHITESPACE)+;
//statement       : ( word WHITESPACE logical);
//word            : (WORD | LOGICAL) ;
//logical         : LOGICAL ;
//
//fragment LOWERCASE  : [a-z] ;
//fragment UPPERCASE  : [A-Z] ;
//fragment DIGIT : [0-9] ;
//
//LOGICAL             : 'and'|'or'|'AND'|'OR' ;
//WORD                : ( LOWERCASE | UPPERCASE | '_')+ ;
//WHITESPACE          : (' ' | '\t') ;
//NEWLINE             : ('\r'? '\n' | '\r')+ ;
//NUMBER              : DIGIT+ ([.,] DIGIT+)? ;

parse           : expression EOF;

expression      : LPAREN expression RPAREN                      #parenExpression
                | left=expression op=binary right=expression    #binaryExpression
                | bool                                          #boolExpression
                | IDENTIFIER                                    #identifierExpression
                ;

//logical_entity  : IDENTIFIER;

bool            : TRUE | FALSE ;

binary          : AND | OR ;

AND             : 'AND' ;
OR              : 'OR' ;
IDENTIFIER      : [a-z_0-9][a-zA-Z_0-9]+ ;
LPAREN          : '(' ;
RPAREN          : ')' ;
TRUE            : 'TRUE' ;
FALSE           : 'FALSE' ;
WS              : [ \r\t\u000C\n]+ -> skip;
