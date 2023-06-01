.globl _start
.text
_start:
	addi x5,x0,41#x5 = 0+41
	addi x6,x0,43#x6 = 0+43
	addi x7,x0,47#x7 = 0+47
	add x28,x5,x6#x28 = 41+43
	add x28,x28,x7#x28= 84+47 =131
exit:
 	addi x17, x0, 10 # call number 10 = exit
 	ecall