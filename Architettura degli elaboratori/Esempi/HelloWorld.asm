	.data
str:	.asciz "hello world\n\n"
	.text
main:
	la a0,str
print:	li a7,4
	ecall
	
	
exit:	li  a7,10
	ecall