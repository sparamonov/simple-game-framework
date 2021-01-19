<script>
export default {
    name: 'RoomPage',
    props: [
        'roomId'
    ],
    computed: {
        room() {
            return this.$store.state.rooms[this.roomId] || {}
        }
    },
    created() {
        this.$store.dispatch('loadRooms')
    }
}
</script>

<template>
    <div>
        {{room}}
    </div>
</template>