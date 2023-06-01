.globl 	start
.data
x: .word 1
y: .word 3
z: .word 4
.text

start:
	la t0, x
lw t1, 0(t0)
la t0, y
lw t2, 0(t0)
and t1, t1, t2
la t0, z
sw t1, 0(t0)




exit: 
	addi x17, x0 ,10
	ecall