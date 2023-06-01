.globl _start
.data
.text
_start:
	li x5,0x3
	li x6,0x7
	add x7,x5,x6
	srli x7,x7,1
	
	
	
exit:
	addi x17,x0,10
	ecall