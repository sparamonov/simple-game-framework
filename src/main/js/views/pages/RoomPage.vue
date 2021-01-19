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
        this.$store.dispatch('loadRoom', this.roomId)
    }
}
</script>

<template>
    <div>
        {{room}}
    </div>
</template>