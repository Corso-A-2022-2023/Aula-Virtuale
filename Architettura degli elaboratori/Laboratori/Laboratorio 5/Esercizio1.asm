.globl start

.data
	n1: .word 5 # posizione 0
	n2: .word 5# posizione 4
	n3: .word 5# posizione 8
	n4: .word 5# posizione 12
	tot: .word 0# posizione 16
.text

start:
	la t0,n1
	lw t1,0(t0)#lettura n1
	lw t2,4(t0)#lettura n2
	add t4,t1,t2#somma tra n1 + n2
	lw t3,8(t0)#lettura n3
	add t4,t4,t3#somma di n1+n2+n3
	lw t3,12(t0)#lettura n4 
	#posso usare lo stesso registro per andare all'indirizzo dopo
	add t4,t4,t3#somma di n1 + n2 + n3 n4
	srli t4,t4,2#divisione
	sw t4,16(t0)#salvataggio in tot:
print : 
	addi a0,t4,0
	li a7,1
	ecall
exit:
	addi x17,x0,10
	ecall