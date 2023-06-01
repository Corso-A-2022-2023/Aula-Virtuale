.globl start
.data
	MemVett: .dword -12, 2, 1, 3, 5, 1, 7, 1, -1, 4
.text
start:
	# mancava la dichiarazione del load address ,del contatore e
	#dell'estensione .text
	la t2,MemVett
	add t0,t0,x0#RIS
	addi t1, t1, 0
	addi t3, zero, 10
	CICLO:
	ld t4, 0(t2)#carico l'elemento dell'array
	add t0, t0, t4#Ris += MemVett[i]
	addi t2, t2, 8# vai all'indice successivo
	addi t1, t1, 1#i++
	blt t1, t3, CICLO
print:
	addi a0,t1,0
	li a7,1
	ecall
exit:
	addi x17,x0,10
	ecall