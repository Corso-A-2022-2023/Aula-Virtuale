.globl _start

.text
_start:
	li x5 ,0x8000000000000000
	li x6 ,0xD000000000000000
	#add x30 ,x5,x6#overflow
	sub x28 ,x5,x6# non overflow perchè -8 +3 = -5
	#add x30, x5, x6
	#add x30, x30, x5# overflow
exit:
	addi x17,x0,10# call number 10 = exit
	ecall
